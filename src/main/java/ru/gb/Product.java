package ru.gb;


import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class Product {
    private String id;
    private String title;
    private String price;
}
