package ma.emsi.studentsms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.studentsms.enums.Gender;

import javax.persistence.*;
import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
public class StudentDTOResponse {
    private String fullName;
    private String NID;
    private Gender gender;
    private String address;
    private Boolean enabled;
}

