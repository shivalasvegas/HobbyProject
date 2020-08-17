
 function loggingOut() {
    
    console.log("Logging out");
    localStorage.removeItem('token');
    localStorage.removeItem('user');
    
    window.location.replace("index.html");
    
  }