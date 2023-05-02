function checkVat() {
    var countryCode = document.getElementById('country_code').value;
    var vatNumber = document.getElementById('vat_number').value;
  
    var xhr = new XMLHttpRequest();
    xhr.open('GET', '/check_vat?country_code=' + countryCode + '&vat_number=' + vatNumber);
    xhr.onload = function() {
      document.getElementById('result').innerHTML = xhr.responseText;
    };
    xhr.send();
  }