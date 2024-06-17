Feature: El usuario se puede logear en la aplicacion
  Scenario: Login Form
    Given Ingresar a la pagina "https://campusalalay.pythonanywhere.com/login"
    When Introducir el usuario "michelle" en username
    And Introducir "Michelle123" en Contraseña
    And Seleccionar "Estudiante" en rol
    And Click en el boton iniciar sesion
    Then Se muestra la pagina del home
