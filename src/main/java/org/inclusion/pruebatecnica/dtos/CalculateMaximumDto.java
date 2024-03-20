package org.inclusion.pruebatecnica.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class CalculateMaximumDto {
    @NotNull(message = "El campo 'x' es requerido")
    @PositiveOrZero(message = "El campo 'x' debe ser un número positivo o cero")
    public int x;

    @NotNull(message = "El campo 'y' es requerido")
    @PositiveOrZero(message = "El campo 'y' debe ser un número positivo o cero")
    public int y;

    @NotNull(message = "El campo 'z' es requerido")
    @PositiveOrZero(message = "El campo 'z' debe ser un número positivo o cero")
    public int z;
}
