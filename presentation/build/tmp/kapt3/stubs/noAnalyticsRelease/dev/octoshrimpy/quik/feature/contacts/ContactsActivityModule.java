package dev.octoshrimpy.quik.feature.contacts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\u000f"}, d2 = {"Ldev/octoshrimpy/quik/feature/contacts/ContactsActivityModule;", "", "()V", "provideChips", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "activity", "Ldev/octoshrimpy/quik/feature/contacts/ContactsActivity;", "provideContactsViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Ldev/octoshrimpy/quik/feature/contacts/ContactsViewModel;", "provideIsSharing", "", "presentation_noAnalyticsRelease"})
@dagger.Module
public final class ContactsActivityModule {
    
    public ContactsActivityModule() {
        super();
    }
    
    @dagger.Provides
    public final boolean provideIsSharing(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.contacts.ContactsActivity activity) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final java.util.HashMap<java.lang.String, java.lang.String> provideChips(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.contacts.ContactsActivity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dev.octoshrimpy.quik.injection.ViewModelKey(value = dev.octoshrimpy.quik.feature.contacts.ContactsViewModel.class)
    @dagger.multibindings.IntoMap
    @dagger.Provides
    public final androidx.lifecycle.ViewModel provideContactsViewModel(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.contacts.ContactsViewModel viewModel) {
        return null;
    }
}