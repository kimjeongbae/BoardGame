package review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Review {

    private int score;
    private String text;
    private String created_date;
    private String modified_date;


}
