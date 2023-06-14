const submitForm = async (data, method = 'POST', id) => {
    let url = 'http://localhost:8000/api/interne/ie415/';
    if (method === 'PUT' && id) {
      url += id + '/';
    }
  
    try {
      const response = await fetch(url, {
        method: method,
        headers: {'Content-Type': 'application/json',},
        body: JSON.stringify(data),
      });
  
      if (response.ok) {
        return { success: true };
      } else {
        return { success: false, error: 'Form submission failed.' };
      }
    } catch (error) {
      return { success: false, error: 'An error occurred.' };
    }
  };
  export { submitForm };
  