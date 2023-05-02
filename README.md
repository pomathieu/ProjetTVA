# ProjetTVA
Check VAT
Check VAT is a Flask web application that allows users to check the validity of VAT (Value-Added Tax) numbers for different countries. The application uses a Java library called checkvat to perform the actual validation.

Requirements
Python 3.x
Flask
Java Runtime Environment (JRE)

Installation
Clone the repository to your local machine.
Install the required Python packages by running the following command in your terminal:

pip install -r requirements.txt
Install the JRE if you haven't already done so.

Usage
Navigate to the root directory of the application in your terminal.
Run the following command to start the Flask development server:
flask run

Open your web browser and navigate to http://localhost:5000/.
Enter a country code and a VAT number in the form provided.
Click the "Check VAT" button to submit the form and validate the VAT number.
The result of the validation will be displayed on the page.

License
Check VAT is licensed under the MIT License. See LICENSE for more information.

Credits
Flask (http://flask.pocoo.org/)
checkvat (https://github.com/zeljic/checkvat)
