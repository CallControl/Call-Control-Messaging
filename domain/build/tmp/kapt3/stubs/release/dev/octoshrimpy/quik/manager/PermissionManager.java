package dev.octoshrimpy.quik.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\f"}, d2 = {"Ldev/octoshrimpy/quik/manager/PermissionManager;", "", "hasCalling", "", "hasContacts", "hasExactAlarms", "hasNotifications", "hasPhone", "hasReadSms", "hasSendSms", "hasStorage", "isDefaultSms", "domain_release"})
public abstract interface PermissionManager {
    
    public abstract boolean isDefaultSms();
    
    public abstract boolean hasReadSms();
    
    public abstract boolean hasSendSms();
    
    public abstract boolean hasContacts();
    
    public abstract boolean hasNotifications();
    
    public abstract boolean hasPhone();
    
    public abstract boolean hasCalling();
    
    public abstract boolean hasStorage();
    
    public abstract boolean hasExactAlarms();
}