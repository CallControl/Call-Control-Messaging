package dev.octoshrimpy.quik.common.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u0004\b\u0001\u0010\u0003*\u0014\b\u0002\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u00020\u00062\u00020\u0007B\u0005\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0014J\b\u0010\'\u001a\u00020(H\u0014J\u0010\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u000eH\u0014J\b\u0010+\u001a\u00020(H\u0016J\u0010\u0010,\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.J\u0010\u0010,\u001a\u00020(2\b\b\u0001\u0010/\u001a\u00020\u0014J\u000e\u00100\u001a\u00020(2\u0006\u00101\u001a\u000202R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u00028\u0002X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001f8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010!\u00a8\u00063"}, d2 = {"Ldev/octoshrimpy/quik/common/base/QkController;", "ViewContract", "Ldev/octoshrimpy/quik/common/base/QkViewContract;", "State", "Presenter", "Ldev/octoshrimpy/quik/common/base/QkPresenter;", "Lcom/bluelinelabs/conductor/archlifecycle/LifecycleController;", "Lkotlinx/android/extensions/LayoutContainer;", "()V", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "getAppCompatActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "containerView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "layoutRes", "", "getLayoutRes", "()I", "setLayoutRes", "(I)V", "presenter", "getPresenter", "()Ldev/octoshrimpy/quik/common/base/QkPresenter;", "setPresenter", "(Ldev/octoshrimpy/quik/common/base/QkPresenter;)V", "themedActivity", "Ldev/octoshrimpy/quik/common/base/QkThemedActivity;", "getThemedActivity", "()Ldev/octoshrimpy/quik/common/base/QkThemedActivity;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "", "onDestroyView", "view", "onViewCreated", "setTitle", "title", "", "titleId", "showBackButton", "show", "", "presentation_noAnalyticsRelease"})
public abstract class QkController<ViewContract extends dev.octoshrimpy.quik.common.base.QkViewContract<? super State>, State extends java.lang.Object, Presenter extends dev.octoshrimpy.quik.common.base.QkPresenter<ViewContract, State>> extends com.bluelinelabs.conductor.archlifecycle.LifecycleController implements kotlinx.android.extensions.LayoutContainer {
    @org.jetbrains.annotations.Nullable
    private android.view.View containerView;
    @androidx.annotation.LayoutRes
    private int layoutRes = 0;
    private java.util.HashMap _$_findViewCache;
    
    public QkController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract Presenter getPresenter();
    
    public abstract void setPresenter(@org.jetbrains.annotations.NotNull
    Presenter p0);
    
    private final androidx.appcompat.app.AppCompatActivity getAppCompatActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    protected final dev.octoshrimpy.quik.common.base.QkThemedActivity getThemedActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View getContainerView() {
        return null;
    }
    
    public void setContainerView(@org.jetbrains.annotations.Nullable
    android.view.View p0) {
    }
    
    public final int getLayoutRes() {
        return 0;
    }
    
    public final void setLayoutRes(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup container) {
        return null;
    }
    
    public void onViewCreated() {
    }
    
    public final void setTitle(@androidx.annotation.StringRes
    int titleId) {
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence title) {
    }
    
    public final void showBackButton(boolean show) {
    }
    
    @java.lang.Override
    protected void onDestroyView(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}