package eud.sm.dto;

import lombok.*;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class Cust {
    private String custId;
    private String custPwd;
    private String custName;
    private LocalDateTime custRegdate;
    private LocalDateTime custUpdate;
}
