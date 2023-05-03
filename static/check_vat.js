function checkVat() {
    console.log("checkVat function called");
    var countryCode = document.getElementById('country_code').value;
    var vatNumber = document.getElementById('vat_number').value;
  
    var xhr = new XMLHttpRequest();
    xhr.open('GET', '/check_vat?country_code=' + countryCode + '&vat_number=' + vatNumber);
    xhr.onload = function() {
        console.log("API response received: " + xhr.responseText);
        var response = JSON.parse(xhr.responseText);
        document.getElementById('result').innerHTML = response.message;
    

    };
    xhr.send();
  }