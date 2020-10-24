package org.picon.domain;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Post {
    @Id @GeneratedValue
    private Long id;
    private Coordinate coordinate;
    private Address address;
    @Enumerated(EnumType.STRING)
    private Emotion emotion;
    private String memo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate createDate;

    public static Post of(Coordinate coordinate, Address address, Emotion emotion, String memo) {
        return new Post(null, coordinate, address, emotion, memo, LocalDate.now());
    }
}
