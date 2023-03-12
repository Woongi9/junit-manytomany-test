
- Java 17
- Spring Boot 3.0.3
- JUnit 5
- H2 database
- IntelliJ IDEA


## Brief code

```java
@Entity
@Table(name = "student")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Nullable
    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments = new ArrayList<>();
}


@Entity
@Table(name = "course")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Nullable
    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments = new ArrayList<>();
}


@Entity
@Table(name = "enrollment")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

}
```

## Result Display

In run test

<img width="814" alt="image" src="https://user-images.githubusercontent.com/79649052/222061935-6e89ee2f-1576-494f-bc71-4f70a3508d43.png">


In test debug

<img width="814" alt="image" src="https://user-images.githubusercontent.com/79649052/222061806-d2ee3f06-a30b-463b-8c24-c5ed81b5b0d1.png">

In main thread

<img width="699" alt="image" src="https://user-images.githubusercontent.com/79649052/222062099-002b0055-e6a5-410d-9eab-e13124f4673a.png">