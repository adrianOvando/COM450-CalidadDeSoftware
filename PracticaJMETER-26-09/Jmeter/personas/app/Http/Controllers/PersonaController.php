<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Persona;

class PersonaController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        //
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        return view('personas.create');
    }

    public function store(Request $request)
    {
        // Valida los datos (opcional)
        $request->validate([
            'nombre' => 'required|string|max:255',
            'apellidos' => 'required|string|max:255',
            'correo' => 'required|email|unique:personas,correo',
            'sexo' => 'required|string',
        ]);

        // Crea la persona
        $persona = Persona::create([
            'nombres' => $request->nombre,
            'apellidos' => $request->apellidos,
            'correo' => $request->correo,
            'sexo' => $request->sexo,
        ]);

        // Puedes redirigir a otra página o devolver JSON
        return redirect()->route('personas.create')->with('success', 'Persona registrada');
    }


    /**
     * Display the specified resource.
     */
    public function show(string $id)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(string $id)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, string $id)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        //
    }
}
