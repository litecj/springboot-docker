package net.litecj702.UserService.item.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@RequiredArgsConstructor
public class Item {
    private @Id
    String id;
    private String name;
    private double price;

}
