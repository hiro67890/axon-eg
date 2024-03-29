package com.example.productsservice.rest

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@Tag(description = "Products Service API", name = "Products Service API")
@RestController
@RequestMapping("/products")
class ProductsController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(
        summary = "xxxx"
    )
    fun createProduct(): String {
        return "HTTP POST Handled"
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(
        summary = "xxxx"
    )
    fun getProduct(): String {
        return "HTTP GET Handled"
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(
        summary = "xxxx"
    )
    fun updateProduct(): String {
        return "HTTP GET Handled"
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(
        summary = "xxxx"
    )
    fun deleteProduct(): String {
        return "HTTP GET Handled"
    }
}