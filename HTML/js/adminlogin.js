
function validate(form){

if (form.userid.value == "admin@admin.com" && form.userpwd.value == "admin"){
alert ("Login successful");
//window.location="adminportal.html";

window.open("adminportal.html"); // Redirecting to other page.
}
else{

alert("Wrong username or password");
// Disabling fields after 3 attempts.

}
}
