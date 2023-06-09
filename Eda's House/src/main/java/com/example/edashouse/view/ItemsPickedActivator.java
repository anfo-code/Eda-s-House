package com.example.edashouse.view;

import com.example.edashouse.model.constants.Characters;
import com.example.edashouse.model.constants.Constants;
import com.example.edashouse.model.constants.ImageURL;
import com.example.edashouse.model.constants.NPCIdentity;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ItemsPickedActivator {
    private Layout layout;

    public ItemsPickedActivator(Layout layout) {
        this.layout = layout;
        setUpPickedItemView();
    }

    /**
     * Sets up the view for the picked item.
     */
    private void setUpPickedItemView() {
        // Initialize the image
        Image image = new Image(ImageURL.SNAKES_SKIN.getURL());
        ImageView pickedItemView = new ImageView(image);
        // Set sizes
        pickedItemView.setFitWidth(Constants.GRID_CELL_SIZE.getValue());
        pickedItemView.setFitHeight(Constants.GRID_CELL_SIZE.getValue());
        // Set coordinates
        pickedItemView.setLayoutX(Characters.PICKED_ITEM.getCoordinates()[0]);
        pickedItemView.setLayoutY(Characters.PICKED_ITEM.getCoordinates()[1]);
        // Add to Pane
        layout.getPane().getChildren().add(Characters.PICKED_ITEM.getIndex(), pickedItemView);
    }

    /**
     * Updates the position of the picked item view.
     *
     * @param newCoordinates the new coordinates of the picked item
     */
    private void updatePickedItemViewPosition(int[] newCoordinates) {
        // TODO: Implement the logic to update the position of the picked item view
    }

    /**
     * Updates the image of the picked item view based on the NPC identity.
     *
     * @param npcId the NPC identity
     */
    private void updatePickedItemViewImage(NPCIdentity npcId) {
        // TODO: Implement the logic to update the image of the picked item view based on the NPC identity
    }
}
