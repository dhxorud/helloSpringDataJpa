package kr.ac.hansung.cse.hellospringdatajpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    private String password;

    private String role = "ROLE_USER";

    public User() {}

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getter & Setter
    public Long getId() { return id; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    // 여기서 username 필드가 필요합니다.
    public String getUsername() {
        return email; // 이메일을 username으로 사용하거나
    }

    public void setUsername(String username) {
        // 이메일을 username으로 사용하려면 여기에 이메일 값을 설정
    }
}
