package view.gui;

public enum Dialogs {

    JEDEN("Han atrapado a william wallace en el ultimo piso del castillo, lo tienen prisionero y llenaron la torre de goblins, golems y serpientes.\n" +
            "¿Podra el caballero matar a todos y liberar a su pueblo a tiempo?"),
    DWA("Muy bien William, este primer piso ha sido facil pero el arquitecto de este castillo lo construyo para evitar escapar. Ten en cuenta que hay medicina y espadas secretas escondidas en los alrededores de los pisos"),
    TRZY("Nuestro guerrero parece sediento de sangre, no discrimina criatura alguna. ¿Podra escapar del laberinto final?"),
    CZTERY("William! William! Se empiezan a escuchar los gritos del pueblo que vienen por una ventana de la torre, saben que su heroe esta llegando, ¿podra William escapar a tiempo?"),
    PIEC("El temor de los vikingos ha vuelto nuevamente, su espada no tiene perdon, su armadura ensangrentada parece reforzarse piso a piso"),
    SZESC("El elixir magico recuperara la vida de William, elige sabiamente cuando tomarlo"),
    SIEDEM("Se escuchan los gritos de los goblins, la leyenda ya esta corriendo en los distintos pisos, William ha vuelto!"),
    OSIEM("El duque de holanda ha mandado tropas para que ayuden a salvar el pueblo, esto le da mas tiempo a william para poder escapar a tiempo y salvar a su familia"),
    DZIEWIEC("La espada sedienta no tiene perdon, no discrimina goblins ni golems, sigue asi William, tu pueblo te necesita"),
    DZIESIEC("Ya han creado el cementerio nacional William Wallace, todos sucumben frente a su poderosa espada. Ultimo piso para nuestra leyenda de 8 bits");

    private final String text;

    private Dialogs(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
