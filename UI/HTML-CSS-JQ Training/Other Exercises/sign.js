function validateSignupForm() {
	var mail = document.getElementById("signEmail").value;
	var password = document.getElementById("signPassword").value;

	if (mail == "" || password == "") {
		document.getElementById("errorMsg").innerHTML = "Please fill the required fields"
		return false;
	}

	else if (password.length > 6) {
		document.getElementById("errorMsg").innerHTML = "Your password must include atleast 8 characters"
		return false;
	}
	else {
		alert("Successfully signed up");
		return true;
	}
}