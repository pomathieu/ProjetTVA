from flask import Flask, render_template, request
import subprocess

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
    command = ['java', '-cp', 'checkvat-1.0.3.jar', 'vatjava.Main', country_code, vat_number]
    try:
        output = subprocess.check_output(command, stderr=subprocess.STDOUT)
    except subprocess.CalledProcessError as e:
        # If the Java program returns a non-zero exit code, capture the error message
        output = e.output

    # Decode the output to a string
    result = output.decode('utf-8').strip()

    # Return the result as plain text
    return result