package com.didimessup;

import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;

import javax.inject.Inject;
import java.awt.*;

public class DidIMessUpOverlay extends OverlayPanel
{
    @Inject
    public DidIMessUpOverlay()
    {
        setPosition(OverlayPosition.TOP_LEFT);
    }

    @Override
    public Dimension render(Graphics2D graphics)
    {
        panelComponent.getChildren().clear();

        panelComponent.getChildren().add(
                LineComponent.builder()
                        .left("Did I Mess Up?")
                        .right("Ready")
                        .build()
        );

        return super.render(graphics);
    }
}
