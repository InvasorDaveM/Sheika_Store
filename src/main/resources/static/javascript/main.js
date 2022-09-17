function insertCustomerData() {
    let name = document.getElementById('nameInput').value
    let address = document.getElementById('addressInput').value
    let birthdate = document.getElementById('birthdateInput').value
    let user = document.getElementById('userInput').value
    let password= document.getElementById('passwordInput').value
    let confirmPassword = document.getElementById('confirmPasswordInput').value



    //TEMPORAL
    let data = {
        name: name, address: address, birthdate: birthdate, user: user, password: password, confirmPassword: confirmPassword
    }

    let json = JSON.stringify(data)
    console.log(json)
}
