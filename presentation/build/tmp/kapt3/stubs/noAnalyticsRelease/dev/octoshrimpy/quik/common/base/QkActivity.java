package dev.octoshrimpy.quik.common.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0015J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\rH\u0014R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001a"}, d2 = {"Ldev/octoshrimpy/quik/common/base/QkActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "menu", "Lio/reactivex/subjects/Subject;", "Landroid/view/Menu;", "getMenu", "()Lio/reactivex/subjects/Subject;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setContentView", "layoutResID", "", "setTitle", "title", "", "titleId", "showBackButton", "show", "presentation_noAnalyticsRelease"})
public abstract class QkActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<android.view.Menu> menu = null;
    private java.util.HashMap _$_findViewCache;
    
    public QkActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final io.reactivex.subjects.Subject<android.view.Menu> getMenu() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"InlinedApi"})
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public void setContentView(int layoutResID) {
    }
    
    @java.lang.Override
    public void setTitle(int titleId) {
    }
    
    @java.lang.Override
    public void setTitle(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence title) {
    }
    
    @java.lang.Override
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable
    android.view.Menu menu) {
        return false;
    }
    
    protected void showBackButton(boolean show) {
    }
}