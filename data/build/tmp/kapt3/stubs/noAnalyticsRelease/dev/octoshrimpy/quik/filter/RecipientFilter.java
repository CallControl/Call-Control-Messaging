package dev.octoshrimpy.quik.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Ldev/octoshrimpy/quik/filter/RecipientFilter;", "Ldev/octoshrimpy/quik/filter/Filter;", "Ldev/octoshrimpy/quik/model/Recipient;", "contactFilter", "Ldev/octoshrimpy/quik/filter/ContactFilter;", "phoneNumberFilter", "Ldev/octoshrimpy/quik/filter/PhoneNumberFilter;", "(Ldev/octoshrimpy/quik/filter/ContactFilter;Ldev/octoshrimpy/quik/filter/PhoneNumberFilter;)V", "filter", "", "item", "query", "", "data_noAnalyticsRelease"})
public final class RecipientFilter extends dev.octoshrimpy.quik.filter.Filter<dev.octoshrimpy.quik.model.Recipient> {
    private final dev.octoshrimpy.quik.filter.ContactFilter contactFilter = null;
    private final dev.octoshrimpy.quik.filter.PhoneNumberFilter phoneNumberFilter = null;
    
    @javax.inject.Inject
    public RecipientFilter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.filter.ContactFilter contactFilter, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.filter.PhoneNumberFilter phoneNumberFilter) {
        super();
    }
    
    @java.lang.Override
    public boolean filter(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.model.Recipient item, @org.jetbrains.annotations.NotNull
    java.lang.CharSequence query) {
        return false;
    }
}