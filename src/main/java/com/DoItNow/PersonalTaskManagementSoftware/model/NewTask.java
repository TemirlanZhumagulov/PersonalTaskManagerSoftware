package com.DoItNow.PersonalTaskManagementSoftware.model;

import java.time.LocalDateTime;

public interface NewTask {
    String getTitle();
    LocalDateTime getStart();
    LocalDateTime getEnd();
}
