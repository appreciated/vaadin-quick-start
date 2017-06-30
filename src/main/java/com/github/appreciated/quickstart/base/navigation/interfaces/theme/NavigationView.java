package com.github.appreciated.quickstart.base.navigation.interfaces.theme;

import com.github.appreciated.quickstart.base.authentication.login.AccessControl;
import com.github.appreciated.quickstart.base.authentication.registration.RegistrationControl;
import com.github.appreciated.quickstart.base.navigation.WebAppDescription;
import com.github.appreciated.quickstart.base.navigation.interfaces.attributes.HasContextActions;
import com.github.appreciated.quickstart.base.navigation.interfaces.attributes.HasSearch;
import com.github.appreciated.quickstart.base.navigation.interfaces.base.Subpage;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Component;
import com.vaadin.ui.Layout;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by appreciated on 10.12.2016.
 */
public interface NavigationView extends Component {

    default void initWithConfiguration(Stream<AbstractMap.SimpleEntry<String, Boolean>> configurations) {}

    void initNavigationElements(Stream<Subpage> pages);

    void initUserFunctionality(WebAppDescription description);

    void initCustomMenuElements(List<Component> components);

    void initWithTitle(String title);

    AbstractOrderedLayout getHolder();

    void disableLogout();

    void setCurrentContainerLabel(String label);

    void setCurrentActions(HasContextActions actions);

    void allowPercentagePageHeight(boolean allow);

    default void setPageTitleVisibility(boolean hide) {}

    void setCurrentSearchNavigable(HasSearch navigable);

    void initWithAccessControl(AccessControl accessControl);

    void initRegistrationControl(RegistrationControl registrationControl);

    Layout getContainerView();
}