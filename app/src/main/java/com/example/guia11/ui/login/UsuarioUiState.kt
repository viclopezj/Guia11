package com.example.guia11.ui.login

// Modelo principal que representa el estado del formulario del usuario
data class UsuarioUiState (
    val nombre: String = "",                        // Nombre de usuario
    val correo: String = "",                        // Correo electronico
    val clave: String = "",                         // Contraseña
    val direccion: String = "",                     // Direccion del usuario
    val aceptaTerminos: Boolean = false,            // Confirmacion de terminos
    val errores: UsuarioErrores = UsuarioErrores()  // Objeto que contiene los errores por campo
)