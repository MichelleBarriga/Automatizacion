Feature: El docente puede cancelar el registro de un curso
  Scenario: Registro Form
    Given Ingresar a "https://campusalalay.pythonanywhere.com/login"
    When Introducir "Valeria Michelle" en Username
    And Introducir "Michelle123@" en Contraseña
    And Seleccionar "Docente" en rol
    And Click en el boton iniciar sesion
    And Click en el boton registrar curso
    And Introducir "titulo" en Titulo
    And Click en el boton cancelar
    Then Mostrar mensaje de confirmacion de cancelacion
