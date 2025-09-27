<form method="POST" action="{{ route('personas.store') }}">
    @csrf
    <input type="text" name="nombre">
    <input type="text" name="apellidos">
    <input type="email" name="correo">
    <select name="sexo">
        <option value="M">Masculino</option>
        <option value="F">Femenino</option>
    </select>
    <button type="submit">Registrar</button>
</form>
