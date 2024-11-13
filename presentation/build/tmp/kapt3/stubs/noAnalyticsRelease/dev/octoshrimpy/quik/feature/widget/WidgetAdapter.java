package dev.octoshrimpy.quik.feature.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 V2\u00020\u0001:\u0001VB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010C\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010F\u001a\u00020\u0012H\u0002J\u0010\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0006H\u0002J\b\u0010J\u001a\u00020\u0006H\u0016J\u0010\u0010K\u001a\u00020L2\u0006\u0010I\u001a\u00020\u0006H\u0016J\b\u0010M\u001a\u00020HH\u0016J\b\u0010N\u001a\u00020HH\u0002J\u0010\u0010O\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0006H\u0016J\b\u0010P\u001a\u00020\u0006H\u0016J\b\u0010Q\u001a\u00020\u0012H\u0016J\b\u0010R\u001a\u00020SH\u0016J\b\u0010T\u001a\u00020SH\u0016J\b\u0010U\u001a\u00020SH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b1\u0010\u0014R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u00108\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00109\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b:\u0010\u0010R\u0014\u0010;\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b<\u0010\u0010R\u0014\u0010=\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b>\u0010\u0010R\u0014\u0010?\u001a\u00020@8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bA\u0010B\u00a8\u0006W"}, d2 = {"Ldev/octoshrimpy/quik/feature/widget/WidgetAdapter;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "intent", "Landroid/content/Intent;", "(Landroid/content/Intent;)V", "appWidgetId", "", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "kotlin.jvm.PlatformType", "getAppWidgetManager", "()Landroid/appwidget/AppWidgetManager;", "appWidgetManager$delegate", "Lkotlin/Lazy;", "background", "getBackground", "()I", "black", "", "getBlack", "()Z", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "getColors", "()Ldev/octoshrimpy/quik/common/util/Colors;", "setColors", "(Ldev/octoshrimpy/quik/common/util/Colors;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "getConversationRepo", "()Ldev/octoshrimpy/quik/repository/ConversationRepository;", "setConversationRepo", "(Ldev/octoshrimpy/quik/repository/ConversationRepository;)V", "conversations", "", "Ldev/octoshrimpy/quik/model/Conversation;", "dateFormatter", "Ldev/octoshrimpy/quik/common/util/DateFormatter;", "getDateFormatter", "()Ldev/octoshrimpy/quik/common/util/DateFormatter;", "setDateFormatter", "(Ldev/octoshrimpy/quik/common/util/DateFormatter;)V", "night", "getNight", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "getPrefs", "()Ldev/octoshrimpy/quik/util/Preferences;", "setPrefs", "(Ldev/octoshrimpy/quik/util/Preferences;)V", "smallWidget", "textPrimary", "getTextPrimary", "textSecondary", "getTextSecondary", "textTertiary", "getTextTertiary", "theme", "Ldev/octoshrimpy/quik/common/util/Colors$Theme;", "getTheme", "()Ldev/octoshrimpy/quik/common/util/Colors$Theme;", "boldText", "", "text", "shouldBold", "getConversationView", "Landroid/widget/RemoteViews;", "position", "getCount", "getItemId", "", "getLoadingView", "getOverflowView", "getViewAt", "getViewTypeCount", "hasStableIds", "onCreate", "", "onDataSetChanged", "onDestroy", "Companion", "presentation_noAnalyticsRelease"})
public final class WidgetAdapter implements android.widget.RemoteViewsService.RemoteViewsFactory {
    @org.jetbrains.annotations.NotNull
    public static final dev.octoshrimpy.quik.feature.widget.WidgetAdapter.Companion Companion = null;
    private static final int MAX_CONVERSATIONS_COUNT = 25;
    @javax.inject.Inject
    public android.content.Context context;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.Colors colors;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.DateFormatter dateFormatter;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.util.Preferences prefs;
    private final int appWidgetId = 0;
    private final boolean smallWidget = false;
    private java.util.List<? extends dev.octoshrimpy.quik.model.Conversation> conversations;
    private final kotlin.Lazy appWidgetManager$delegate = null;
    
    public WidgetAdapter(@org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
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
    public final dev.octoshrimpy.quik.common.util.DateFormatter getDateFormatter() {
        return null;
    }
    
    public final void setDateFormatter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.DateFormatter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.util.Preferences getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences p0) {
    }
    
    private final android.appwidget.AppWidgetManager getAppWidgetManager() {
        return null;
    }
    
    private final boolean getNight() {
        return false;
    }
    
    private final boolean getBlack() {
        return false;
    }
    
    private final dev.octoshrimpy.quik.common.util.Colors.Theme getTheme() {
        return null;
    }
    
    private final int getBackground() {
        return 0;
    }
    
    private final int getTextPrimary() {
        return 0;
    }
    
    private final int getTextSecondary() {
        return 0;
    }
    
    private final int getTextTertiary() {
        return 0;
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    public void onDataSetChanged() {
    }
    
    /**
     * Returns the number of rows to show. If there are more conversations than the max count,
     * we'll return the max count + 1, where the last row just shows "View more conversations"
     */
    @java.lang.Override
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.widget.RemoteViews getViewAt(int position) {
        return null;
    }
    
    private final android.widget.RemoteViews getConversationView(int position) {
        return null;
    }
    
    private final android.widget.RemoteViews getOverflowView() {
        return null;
    }
    
    private final java.lang.CharSequence boldText(java.lang.CharSequence text, boolean shouldBold) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.widget.RemoteViews getLoadingView() {
        return null;
    }
    
    @java.lang.Override
    public int getViewTypeCount() {
        return 0;
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override
    public boolean hasStableIds() {
        return false;
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldev/octoshrimpy/quik/feature/widget/WidgetAdapter$Companion;", "", "()V", "MAX_CONVERSATIONS_COUNT", "", "presentation_noAnalyticsRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}