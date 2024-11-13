package dev.octoshrimpy.quik.common.base;

import java.lang.System;

/**
 * Base activity that automatically applies any necessary theme theme settings and colors
 *
 * In most cases, this should be used instead of the base QkActivity, except for when
 * an activity does not depend on the theme
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020,00H\u0016J\u0012\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0015J\u0012\u00105\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*\u00a8\u00066"}, d2 = {"Ldev/octoshrimpy/quik/common/base/QkThemedActivity;", "Ldev/octoshrimpy/quik/common/base/QkActivity;", "()V", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "getColors", "()Ldev/octoshrimpy/quik/common/util/Colors;", "setColors", "(Ldev/octoshrimpy/quik/common/util/Colors;)V", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "getConversationRepo", "()Ldev/octoshrimpy/quik/repository/ConversationRepository;", "setConversationRepo", "(Ldev/octoshrimpy/quik/repository/ConversationRepository;)V", "messageRepo", "Ldev/octoshrimpy/quik/repository/MessageRepository;", "getMessageRepo", "()Ldev/octoshrimpy/quik/repository/MessageRepository;", "setMessageRepo", "(Ldev/octoshrimpy/quik/repository/MessageRepository;)V", "phoneNumberUtils", "Ldev/octoshrimpy/quik/util/PhoneNumberUtils;", "getPhoneNumberUtils", "()Ldev/octoshrimpy/quik/util/PhoneNumberUtils;", "setPhoneNumberUtils", "(Ldev/octoshrimpy/quik/util/PhoneNumberUtils;)V", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "getPrefs", "()Ldev/octoshrimpy/quik/util/Preferences;", "setPrefs", "(Ldev/octoshrimpy/quik/util/Preferences;)V", "theme", "Lio/reactivex/Observable;", "Ldev/octoshrimpy/quik/common/util/Colors$Theme;", "getTheme", "()Lio/reactivex/Observable;", "threadId", "Lio/reactivex/subjects/Subject;", "", "getThreadId", "()Lio/reactivex/subjects/Subject;", "getActivityThemeRes", "", "black", "", "getColoredMenuItems", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPostCreate", "presentation_noAnalyticsRelease"})
public abstract class QkThemedActivity extends dev.octoshrimpy.quik.common.base.QkActivity {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.Colors colors;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.repository.MessageRepository messageRepo;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.util.PhoneNumberUtils phoneNumberUtils;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.util.Preferences prefs;
    
    /**
     * In case the activity should be themed for a specific conversation, the selected conversation
     * can be changed by pushing the threadId to this subject
     */
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<java.lang.Long> threadId = null;
    
    /**
     * Switch the theme if the threadId changes
     * Set it based on the latest message in the conversation
     */
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.Observable<dev.octoshrimpy.quik.common.util.Colors.Theme> theme = null;
    private java.util.HashMap _$_findViewCache;
    
    public QkThemedActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.util.Colors getColors() {
        return null;
    }
    
    public final void setColors(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.Colors p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.repository.ConversationRepository getConversationRepo() {
        return null;
    }
    
    public final void setConversationRepo(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.repository.MessageRepository getMessageRepo() {
        return null;
    }
    
    public final void setMessageRepo(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.MessageRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.util.PhoneNumberUtils getPhoneNumberUtils() {
        return null;
    }
    
    public final void setPhoneNumberUtils(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.PhoneNumberUtils p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.util.Preferences getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<java.lang.Long> getThreadId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.Observable<dev.octoshrimpy.quik.common.util.Colors.Theme> getTheme() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"InlinedApi"})
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onPostCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.Integer> getColoredMenuItems() {
        return null;
    }
    
    /**
     * This can be overridden in case an activity does not want to use the default themes
     */
    public int getActivityThemeRes(boolean black) {
        return 0;
    }
}