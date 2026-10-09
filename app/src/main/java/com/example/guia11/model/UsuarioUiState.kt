package com.example.guia11.model

data class UsuarioUiState (
    val nombre: String = "",        // Nombre del usuario
    val correo: String = "",        // Correo Electronico
    val clave: String = "",         // Contraseña
    val direccion: String = "",     // Direccion del usuario
    val aceptaTerminos: Boolean = false, // Confirmacion de terminos
    val errores: UsuarioErrores = UsuarioErrores() // Objeto que contiene los errores
)