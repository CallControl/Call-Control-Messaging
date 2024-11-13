package dev.octoshrimpy.quik.feature.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\"\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0010H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006$"}, d2 = {"Ldev/octoshrimpy/quik/feature/widget/WidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "()V", "colors", "Ldev/octoshrimpy/quik/common/util/Colors;", "getColors", "()Ldev/octoshrimpy/quik/common/util/Colors;", "setColors", "(Ldev/octoshrimpy/quik/common/util/Colors;)V", "prefs", "Ldev/octoshrimpy/quik/util/Preferences;", "getPrefs", "()Ldev/octoshrimpy/quik/util/Preferences;", "setPrefs", "(Ldev/octoshrimpy/quik/util/Preferences;)V", "isSmallWidget", "", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetId", "", "onAppWidgetOptionsChanged", "", "context", "Landroid/content/Context;", "newOptions", "Landroid/os/Bundle;", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetIds", "", "updateData", "updateWidget", "smallWidget", "presentation_noAnalyticsRelease"})
public final class WidgetProvider extends android.appwidget.AppWidgetProvider {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.Colors colors;
    @javax.inject.Inject
    public dev.octoshrimpy.quik.util.Preferences prefs;
    
    public WidgetProvider() {
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
    public final dev.octoshrimpy.quik.util.Preferences getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.util.Preferences p0) {
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
    
    /**
     * Update all widgets in the list
     */
    @java.lang.Override
    public void onUpdate(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.appwidget.AppWidgetManager appWidgetManager, @org.jetbrains.annotations.NotNull
    int[] appWidgetIds) {
    }
    
    /**
     * Notify all the widgets that they should update their adapter data
     */
    private final void updateData(android.content.Context context) {
    }
    
    /**
     * Update widget when widget size changes
     */
    @java.lang.Override
    public void onAppWidgetOptionsChanged(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.appwidget.AppWidgetManager appWidgetManager, int appWidgetId, @org.jetbrains.annotations.NotNull
    android.os.Bundle newOptions) {
    }
    
    /**
     * Returns true when widget has less than 4 columns, else false
     */
    private final boolean isSmallWidget(android.appwidget.AppWidgetManager appWidgetManager, int appWidgetId) {
        return false;
    }
    
    /**
     * Update the widget appWidgetId
     */
    private final void updateWidget(android.content.Context context, int appWidgetId, boolean smallWidget) {
    }
}