package br.com.everton.realmeet;

import br.com.everton.realmeet.api.facade.RoomsApi;
import br.com.everton.realmeet.api.model.Room;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.concurrent.CompletableFuture;

import static java.util.concurrent.CompletableFuture.supplyAsync;

@RestController
public class RoomController implements RoomsApi {

    @Override
    public CompletableFuture<ResponseEntity<Room>> listRooms(@Valid Long id) {
		System.print("");
        return supplyAsync(() -> ResponseEntity.ok(new Room().id(1L).name("Room #1")));
    }
}
