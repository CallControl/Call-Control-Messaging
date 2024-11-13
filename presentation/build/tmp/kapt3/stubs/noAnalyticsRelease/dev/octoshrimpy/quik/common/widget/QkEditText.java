package dev.octoshrimpy.quik.common.widget;

import java.lang.System;

/**
 * Custom implementation of EditText to allow for dynamic text colors
 *
 * Beware of updating to extend AppCompatTextView, as this inexplicably breaks the view in
 * the contacts chip view
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001f"}, d2 = {"Ldev/octoshrimpy/quik/common/widget/QkEditText;", "Landroid/widget/EditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "backspaces", "Lio/reactivex/subjects/Subject;", "", "getBackspaces", "()Lio/reactivex/subjects/Subject;", "inputContentSelected", "Landroidx/core/view/inputmethod/InputContentInfoCompat;", "getInputContentSelected", "supportsInputContent", "", "getSupportsInputContent", "()Z", "setSupportsInputContent", "(Z)V", "textViewStyler", "Ldev/octoshrimpy/quik/common/util/TextViewStyler;", "getTextViewStyler", "()Ldev/octoshrimpy/quik/common/util/TextViewStyler;", "setTextViewStyler", "(Ldev/octoshrimpy/quik/common/util/TextViewStyler;)V", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "editorInfo", "Landroid/view/inputmethod/EditorInfo;", "presentation_noAnalyticsRelease"})
public final class QkEditText extends android.widget.EditText {
    @javax.inject.Inject
    public dev.octoshrimpy.quik.common.util.TextViewStyler textViewStyler;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<kotlin.Unit> backspaces = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.subjects.Subject<androidx.core.view.inputmethod.InputContentInfoCompat> inputContentSelected = null;
    private boolean supportsInputContent = false;
    private java.util.HashMap _$_findViewCache;
    
    @kotlin.jvm.JvmOverloads
    public QkEditText(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public QkEditText(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dev.octoshrimpy.quik.common.util.TextViewStyler getTextViewStyler() {
        return null;
    }
    
    public final void setTextViewStyler(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.util.TextViewStyler p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<kotlin.Unit> getBackspaces() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.subjects.Subject<androidx.core.view.inputmethod.InputContentInfoCompat> getInputContentSelected() {
        return null;
    }
    
    public final boolean getSupportsInputContent() {
        return false;
    }
    
    public final void setSupportsInputContent(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.inputmethod.InputConnection onCreateInputConnection(@org.jetbrains.annotations.NotNull
    android.view.inputmethod.EditorInfo editorInfo) {
        return null;
    }
}