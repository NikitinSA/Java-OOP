package Service;

import java.util.Collections;
import java.util.List;

import Comparators.GroupStreamComparator;
import Data.GroupStream;
import Repository.GroupStreamRepository;

public class GroupStreamServiceImpl implements GroupStreamService {

    private final GroupStreamRepository groupStreamRepository;

    public GroupStreamServiceImpl(GroupStreamRepository groupStreamRepository) {
        this.groupStreamRepository = groupStreamRepository;
    }

    public GroupStream saveGroupStream(GroupStream groupStream) {
        return groupStreamRepository.save(groupStream);
    }

    public GroupStream findGroupStreamById(int id) {
        return groupStreamRepository.findById(id);
    }

    public void sortGroupStream(List<GroupStream> groupStreams) {
        Collections.sort(groupStreams, new GroupStreamComparator());
    }
}