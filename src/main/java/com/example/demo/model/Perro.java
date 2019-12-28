package com.example.demo.model;

import com.example.demo.serializer.PerroSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonSerialize(using = PerroSerializer.class)
public class Perro {
    private String raza;
}
