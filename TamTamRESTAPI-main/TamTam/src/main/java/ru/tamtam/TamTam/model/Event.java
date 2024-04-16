package ru.tamtam.TamTam.model;


import lombok.*;

/*@Getter
@Setter
@NoArgsConstructor    ---> @Data(+2)
@AllArgsConstructor
@RequiredArgsConstructor*/

@Data
@Builder
public class Event {
    private String name;
    private String place;
    private String time;
    private int price;
    private String age;
}
