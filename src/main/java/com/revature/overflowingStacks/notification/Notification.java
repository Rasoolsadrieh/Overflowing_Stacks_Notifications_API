package com.revature.overflowingStacks.notification;

import com.revature.overflowingStacks.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import javax.persistence.*;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
@Builder
@Entity
@Table(name = "notification")
public class Notification {
    @Id
    @Column(name = "noti_id") //unique id for
    private String notiId;
    @Column(name = "noti_con")
    private String notiCon;
    @ManyToOne(optional = false)
    @JoinColumn(name = "email", referencedColumnName = "email")
    private User email;
}