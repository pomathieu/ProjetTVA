from flask import Flask, render_template, request
import subprocess
import json

app = Flask(__name__)

@app.route('/')
def home():
    return render_template('check_vat.html')

@app.route('/check_vat')
def check_vat():
    # Get the input data from the GET request
    country_code = request.args.get('country_code')
    vat_number = request.args.get('vat_number')

    # Run the Java code with the input data and capture the output
    command = ['java', '-jar', './target/projettva-1.0-SNAPSHOT.jar', country_code, vat_number]
    try:
        output = subprocess.check_output(command, stderr=subprocess.STDOUT)
        result = output.decode('utf-8').strip()

        # Determine whether the VAT code is valid or not
        is_valid = 'valid' in result.lower()

        # Prepare the response message
        message = result if is_valid else 'The VAT code is invalid.'

    except subprocess.CalledProcessError as e:
        # If the Java program returns a non-zero exit code, capture the error message
        is_valid = False
        message = e.output.decode('utf-8').strip()

    # Prepare the JSON response
    response_data = {
        'valid': is_valid,
        'message': message
    }
    response = json.dumps(response_data)

    # Return the JSON response
    return response