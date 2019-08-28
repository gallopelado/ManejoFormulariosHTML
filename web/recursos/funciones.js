function validarForm(forma) {
    
    // Validamos el usuario.
    const usuario = forma.usuario;
    if (usuario.value === '') {
        
        alert('Debe proporcionar un nombre de usuario');
        usuario.focus();
        usuario.select();
        return false;
        
    }
    
    // Validamos el password.
    const password = forma.password;
    if(password.value === '' || password.value.length < 3) {
        
        alert('Debe proporcionar una clave de al menos 3 dígitos');
        password.focus();
        password.select();
        return false;
        
    }
    
    // Validamos las tecnologías de interés.
    const tecnologias = forma.tecnologia;
    let checkSeleccionado = false;
    
    // Revisamos si se seleccionó algún checkbox.
    for (let i = 0; i < tecnologias.length; i++) {
        
        if (tecnologias[i].checked) {
            checkSeleccionado = true;
        }
        
    }
    
    if (!checkSeleccionado) {
        alert('Debe proporcionar una tecnología.');
        return false;
    }
    
    // Validamos el sexo.
    const sexo = forma.sexo;
    let radioSeleccionado = false;
    
    for (let i=0; i < sexo.length; i++) {
        
        if (sexo[i].checked) {
            
            radioSeleccionado = true;
            
        }
        
    }
    
    if (!radioSeleccionado) {
        
        alert('Debe seleccionar un sexo');
        return false;
        
    }
    
    // Validamos la ocupacion.
    const ocupacion = forma.ocupacion;
    if (ocupacion.value === '') {
        
        alert('Debe seleccionar una ocupacion');
        return false;
        
    }
    
    // Formulario validado.
    alert('Formulario valido, enviando datos...');
    return true;
    
}

