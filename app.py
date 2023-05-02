from flask import Flask, render_template, request
import subprocess

app = Flask(__name__)

@app.route('/')
def home():
    return 'Hello, World! I hope you are doing well ?'

@app.route('/check_vat', methods=['POST'])
def check_vat():
    # Get the input data from the POST request
    country_code = request.form['country_code']
    vat_number = request.form['vat_number']
    
    # Run the Java code with the input data and capture the output
    command = ['java', '-cp', 'checkvat-1.0.3.jar', 'Main', country_code, vat_number]
    try:
        output = subprocess.check_output(command, stderr=subprocess.STDOUT)
    except subprocess.CalledProcessError as e:
        # If the Java program returns a non-zero exit code, capture the error message
        output = e.output

    # Decode the output to a string
    result = output.decode('utf-8')

    # Render the HTML template and pass the result to it
    return render_template('check_vat.html', result=result)