package board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Board {
    private String title;
    private String level;
    private int count;
    private int time;
    private String created_date;
    private String modified_date;

}
