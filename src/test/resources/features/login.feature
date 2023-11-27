  #language:PT

    Funcionalidade: login
    Cenario: Realizar Login
      Dado que esteja na pagina da loginha
      Quando o login for realizado com os seguintes dados
      |usuario|admin|
      |senha  |admin|
      Entao valida que o login foi realizado