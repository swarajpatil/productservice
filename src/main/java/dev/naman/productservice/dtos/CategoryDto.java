package dev.naman.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CategoryDto {
    private long id;
    private String name;
    private List<ProductDto> products;
}
