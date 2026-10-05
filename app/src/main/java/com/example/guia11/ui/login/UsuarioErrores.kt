package com.example.guia11.ui.login

//Modelo que almacena posibles errores individuales del formulario
data class UsuarioErrores (
    val nombre: String? = null,
    val correo: String? = null,
    val clave: String? = null,
    val direccion: String? = null
)