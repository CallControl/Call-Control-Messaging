package dev.octoshrimpy.quik.feature.contacts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u001b\u001a\u00020\u001cH&J0\u0010\u001d\u001a\u00020\u001c2&\u0010\u001e\u001a\"\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010 0\u001fj\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010 `!H&J\b\u0010\"\u001a\u00020\u001cH&R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0007R\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0012X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015\u00a8\u0006#"}, d2 = {"Ldev/octoshrimpy/quik/feature/contacts/ContactsContract;", "Ldev/octoshrimpy/quik/common/base/QkView;", "Ldev/octoshrimpy/quik/feature/contacts/ContactsState;", "composeItemLongPressedIntent", "Lio/reactivex/subjects/Subject;", "Ldev/octoshrimpy/quik/feature/compose/editing/ComposeItem;", "getComposeItemLongPressedIntent", "()Lio/reactivex/subjects/Subject;", "composeItemPressedIntent", "getComposeItemPressedIntent", "phoneNumberActionIntent", "Ldev/octoshrimpy/quik/feature/compose/editing/PhoneNumberAction;", "getPhoneNumberActionIntent", "phoneNumberSelectedIntent", "Ldev/octoshrimpy/quik/extensions/Optional;", "", "getPhoneNumberSelectedIntent", "queryChangedIntent", "Lio/reactivex/Observable;", "", "getQueryChangedIntent", "()Lio/reactivex/Observable;", "queryClearedIntent", "getQueryClearedIntent", "queryEditorActionIntent", "", "getQueryEditorActionIntent", "clearQuery", "", "finish", "result", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "openKeyboard", "presentation_noAnalyticsRelease"})
public abstract interface ContactsContract extends dev.octoshrimpy.quik.common.base.QkView<dev.octoshrimpy.quik.feature.contacts.ContactsState> {
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.CharSequence> getQueryChangedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<?> getQueryClearedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.Observable<java.lang.Integer> getQueryEditorActionIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.subjects.Subject<dev.octoshrimpy.quik.feature.compose.editing.ComposeItem> getComposeItemPressedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.subjects.Subject<dev.octoshrimpy.quik.feature.compose.editing.ComposeItem> getComposeItemLongPressedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.subjects.Subject<dev.octoshrimpy.quik.extensions.Optional<java.lang.Long>> getPhoneNumberSelectedIntent();
    
    @org.jetbrains.annotations.NotNull
    public abstract io.reactivex.subjects.Subject<dev.octoshrimpy.quik.feature.compose.editing.PhoneNumberAction> getPhoneNumberActionIntent();
    
    public abstract void clearQuery();
    
    public abstract void openKeyboard();
    
    public abstract void finish(@org.jetbrains.annotations.NotNull
    java.util.HashMap<java.lang.String, java.lang.String> result);
}