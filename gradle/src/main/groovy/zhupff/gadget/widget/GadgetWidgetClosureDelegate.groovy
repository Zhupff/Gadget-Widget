package zhupff.gadget.widget

import org.gradle.api.Project
import zhupff.gadget.gradle.ClosureDelegate

class GadgetWidgetClosureDelegate extends ClosureDelegate {

    private Project project
    private String version

    @Override
    String name() {
        return "Widget"
    }

    @Override
    void delegate(Project project, Closure closure) {
        this.project = project
        this.version = project.rootProject.ext.GADGET_WIDGET_VERSION
        delegate(closure)
    }

    def widget(way) {
        project.dependencies.add(way, "com.github.Zhupff.Gadget-Widget:widget:$version")
    }
}