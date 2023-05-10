package first_spring_task.spring_first_task.db;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private Long id;
    private String name;
    private String description;
    private double price;
}
