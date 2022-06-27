package com.revature.overflowingStacks.notification;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @Column(name = "notification_id")
    private String notificationId;
    @Column(name = "notification_contents")
    private String contents;
    @Column(name = "notification_date")
    private String date;
    @ManyToOne(optional = false)
    @JoinColumn(name = "recipient_email", referencedColumnName = "email")
    private String email;
}
