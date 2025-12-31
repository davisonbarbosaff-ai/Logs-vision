@Entity
public class LogPunicao {
 @Id @GeneratedValue
 private Long id;
 private String player;
 private String punishment;
 private String staff;
 private String link;
 private LocalDateTime createdAt = LocalDateTime.now();
}
